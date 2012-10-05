package com.ingenuity.salesquote;

import com.ingenuity.salesquote.domain.Quote;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Quote.class)
@Controller
@RequestMapping("/quotes")
@RooWebScaffold(path = "quotes", formBackingObject = Quote.class)
public class QuoteController {
}
