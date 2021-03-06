// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ingenuity.salesquote;

import com.ingenuity.salesquote.SkuController;
import com.ingenuity.salesquote.domain.Category;
import com.ingenuity.salesquote.domain.Sku;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect SkuController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String SkuController.create(@Valid Sku sku, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, sku);
            return "skus/create";
        }
        uiModel.asMap().clear();
        sku.persist();
        return "redirect:/skus/" + encodeUrlPathSegment(sku.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String SkuController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Sku());
        return "skus/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String SkuController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("sku", Sku.findSku(id));
        uiModel.addAttribute("itemId", id);
        return "skus/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String SkuController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("skus", Sku.findSkuEntries(firstResult, sizeNo));
            float nrOfPages = (float) Sku.countSkus() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("skus", Sku.findAllSkus());
        }
        return "skus/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String SkuController.update(@Valid Sku sku, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, sku);
            return "skus/update";
        }
        uiModel.asMap().clear();
        sku.merge();
        return "redirect:/skus/" + encodeUrlPathSegment(sku.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String SkuController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Sku.findSku(id));
        return "skus/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String SkuController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Sku sku = Sku.findSku(id);
        sku.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/skus";
    }
    
    void SkuController.populateEditForm(Model uiModel, Sku sku) {
        uiModel.addAttribute("sku", sku);
        uiModel.addAttribute("categorys", Category.findAllCategorys());
    }
    
    String SkuController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
