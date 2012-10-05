package com.ingenuity.salesquote;

import com.ingenuity.salesquote.domain.Category;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Category.class)
@Controller
@RequestMapping("/categorys")
@RooWebScaffold(path = "categorys", formBackingObject = Category.class)
public class CategoryController {
}
