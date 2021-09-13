package com.seok.book.springboot.web;

import com.seok.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // - 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
// - 각 메소드에 @ReponseBody를 선언하지 않고 한번에 사용할 수 있게 해줌
public class HelloController {

    @GetMapping("/hello")   // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        // @RequestParam
        // - 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션입니다.
        // - 여기서는 외부에서 name (@RequestParam("name")) 이란 이름으로 넘긴 파라미터를
        //   메소드 파라미터 name(String name)에 저장하게 됩니다.
        return new HelloResponseDto(name, amount);
    }
}
