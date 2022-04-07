package com.isep.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/*")
    public ResponseEntity<String> error(){
        return new ResponseEntity<>("  <style>\n" +
                "        @import 'https://fonts.googleapis.com/css?family=Inconsolata';\n" +
                "        * {\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "        html {\n" +
                "            min-height: 100%;\n" +
                "        }\n" +
                "        body {\n" +
                "            box-sizing: border-box;\n" +
                "            height: 100%;\n" +
                "            background-color: #000000;\n" +
                "            background-image: radial-gradient(#11581E, #041607), url(\"https://media.giphy.com/media/oEI9uBYSzLpBK/giphy.gif\");\n" +
                "            background-repeat: no-repeat;\n" +
                "            background-size: cover;\n" +
                "            font-family: 'Inconsolata', Helvetica, sans-serif;\n" +
                "            font-size: 1.5rem;\n" +
                "            color: rgba(128, 255, 128, 0.8);\n" +
                "            text-shadow:\n" +
                "                    0 0 1ex rgba(51, 255, 51, 1),\n" +
                "                    0 0 2px rgba(255, 255, 255, 0.8);\n" +
                "        }\n" +
                "        .noise {\n" +
                "            pointer-events: none;\n" +
                "            position: absolute;\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "            background-image: url(\"https://media.giphy.com/media/oEI9uBYSzLpBK/giphy.gif\");\n" +
                "            background-repeat: no-repeat;\n" +
                "            background-size: cover;\n" +
                "            z-index: -1;\n" +
                "            opacity: .02;\n" +
                "        }\n" +
                "        .overlay {\n" +
                "            pointer-events: none;\n" +
                "            position: absolute;\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "            background:\n" +
                "                    repeating-linear-gradient(\n" +
                "                            180deg,\n" +
                "                            rgba(0, 0, 0, 0) 0,\n" +
                "                            rgba(0, 0, 0, 0.3) 50%,\n" +
                "                            rgba(0, 0, 0, 0) 100%);\n" +
                "            background-size: auto 4px;\n" +
                "            z-index: 1;\n" +
                "        }\n" +
                "        .overlay::before {\n" +
                "            content: \"\";\n" +
                "            pointer-events: none;\n" +
                "            position: absolute;\n" +
                "            display: block;\n" +
                "            top: 0;\n" +
                "            left: 0;\n" +
                "            right: 0;\n" +
                "            bottom: 0;\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "            background-image: linear-gradient(\n" +
                "                    0deg,\n" +
                "                    transparent 0%,\n" +
                "                    rgba(32, 128, 32, 0.2) 2%,\n" +
                "                    rgba(32, 128, 32, 0.8) 3%,\n" +
                "                    rgba(32, 128, 32, 0.2) 3%,\n" +
                "                    transparent 100%);\n" +
                "            background-repeat: no-repeat;\n" +
                "            animation: scan 7.5s linear 0s infinite;\n" +
                "        }\n" +
                "        @keyframes scan {\n" +
                "            0%        { background-position: 0 -100vh; }\n" +
                "            35%, 100% { background-position: 0 100vh; }\n" +
                "        }\n" +
                "        .terminal {\n" +
                "            box-sizing: inherit;\n" +
                "            position: absolute;\n" +
                "            height: 100%;\n" +
                "            width: 1000px;\n" +
                "            max-width: 100%;\n" +
                "            padding: 4rem;\n" +
                "            text-transform: uppercase;\n" +
                "        }\n" +
                "        .output {\n" +
                "            color: rgba(128, 255, 128, 0.8);\n" +
                "            text-shadow:\n" +
                "                    0 0 1px rgba(51, 255, 51, 0.4),\n" +
                "                    0 0 2px rgba(255, 255, 255, 0.8);\n" +
                "        }\n" +
                "        .output::before {\n" +
                "            content: \"> \";\n" +
                "        }\n" +
                "            /*\n" +
                "            .input {\n" +
                "              color: rgba(192, 255, 192, 0.8);\n" +
                "              text-shadow:\n" +
                "                  0 0 1px rgba(51, 255, 51, 0.4),\n" +
                "                  0 0 2px rgba(255, 255, 255, 0.8);\n" +
                "            }\n" +
                "            \u2028\n" +
                "            .input::before {\n" +
                "              content: \"$ \";\n" +
                "            }\n" +
                "            */\n" +
                "        a {\n" +
                "            color: #fff;\n" +
                "            text-decoration: none;\n" +
                "        }\n" +
                "        a::before {\n" +
                "            content: \"[\";\n" +
                "        }\n" +
                "        a::after {\n" +
                "            content: \"]\";\n" +
                "        }\n" +
                "        .errorcode {\n" +
                "            color: white;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"noise\"></div>\n" +
                "<div class=\"overlay\"></div>\n" +
                "<div class=\"terminal\">\n" +
                "    <h1>Error <span class=\"errorcode\">404</span></h1>\n" +
                "    <p class=\"output\">The page you are looking for might have been removed, had its name changed or is temporarily unavailable.</p>\n" +
                "    <p class=\"output\">Please try to <a href=\"#1\">go back</a> or <a href=\"#2\">return to the homepage</a>.</p>\n" +
                "    <p class=\"output\">Good luck.</p>\n" +
                "</div><div class=\"noise\"></div>\n" +
                "<div class=\"overlay\"></div>\n" +
                "<div class=\"terminal\">\n" +
                "    <h1>Error <span class=\"errorcode\">404</span></h1>\n" +
                "    <p class=\"output\">The page you are looking for might have been removed, had its name changed or is temporarily unavailable.</p>\n" +
                "    <p class=\"output\">Please try to <a href=\"#\" onClick=\"window.history.back();\">go back</a> or <a href=\"/getProducts\">return to the all products</a>.</p>\n" +
                "    <p class=\"output\">Good luck.</p>\n" +
                "</div>", HttpStatus.NOT_FOUND);
    }

    @GetMapping(path="/getProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/getProduct")
    public ResponseEntity<Optional<Product>>getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(productRepository.findById(id), HttpStatus.OK);
    }
}
