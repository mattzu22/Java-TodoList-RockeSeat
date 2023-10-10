package br.com.matheusmacedo.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificadores
 * Public
 * Private
 * Protect
*/
@RestController
@RequestMapping("/users")
public class UserController {
    /* 
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros quebrados 0.000
     * Float (float) numeros quebrados só que menores 0.00
     * char (A C ) são caracteres
     * Date (data)
     * Void 
    */
    // annotation @
    @PostMapping("/")
    public void create(@RequestBody UserModel UserModel){
        System.out.println(UserModel.userName);
    }
    
}
