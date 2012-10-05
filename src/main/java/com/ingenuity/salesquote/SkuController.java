package com.ingenuity.salesquote;

import com.ingenuity.salesquote.domain.Sku;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Sku.class)
@Controller
@RequestMapping("/skus")
@RooWebScaffold(path = "skus", formBackingObject = Sku.class)
public class SkuController {
}
