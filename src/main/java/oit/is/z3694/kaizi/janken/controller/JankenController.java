package oit.is.z3694.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {

  /**
   * AC2: GETで /janken にアクセスされた場合
   * username は Model に渡さず janken.html を返す
   */
  @GetMapping("/janken")
  public String jankenGet() {
    return "janken.html";
  }

  /**
   * AC1: index.html から POST でユーザ名が送信された場合
   * 受け取った username を Model にセットして janken.html を返す
   */
  @PostMapping("/janken")
  public String jankenPost(@RequestParam("username") String username, ModelMap model) {
    model.addAttribute("username", username);
    return "janken.html";
  }
}
