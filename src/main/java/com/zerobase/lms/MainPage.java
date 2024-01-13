package com.zerobase.lms;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainPage {

    @RequestMapping("/")
    public String index(){

        return "Index Page";
    }

//    스프링 -> MVC(view -> 템플릿엔진 화면에 내용을 출력 (html))
//    .NET -> MVC(view -> 출력)

//    request -> WEB -> SERVER
//    response -> SERVER -> WEB
    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        String msg = "<html>" +
                "<head>"+
                "<meta charset=\"UTF-8\">"+
                "</head>"+
                "<body>"+
                "<p>hello</p> <p>lms website</p>"+
                "<p>안녕하세요</p>"+
                "<body>"+
                "</html>";
        printWriter.write(msg);
        printWriter.close();
    }
}
