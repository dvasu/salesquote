package com.ingenuity.salesquote;

import com.ingenuity.salesquote.domain.SalesOrder;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = SalesOrder.class)
@Controller
@RequestMapping("/salesorders")
@RooWebScaffold(path = "salesorders", formBackingObject = SalesOrder.class)
public class SalesOrderController {
}
