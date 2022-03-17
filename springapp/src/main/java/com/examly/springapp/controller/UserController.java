package com.examly.springapp.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.examly.springapp.model.User;
import com.examly.springapp.service.UserCRUDService;
import com.examly.springapp.model.Dto;
import com.examly.springapp.repository.UserRepository;
//import com.examly.springapp.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.jpa.repository.Query;
//import org.modelmapper.ModelMapper;

//additional
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

//additional
@CrossOrigin(origins = "*")


@RestController
//@RequestMapping("/admin")
public class UserController {
    
    @Autowired
    private UserCRUDService userService;
  
 
    public UserController(UserCRUDService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public List<Dto> getUsers(){
        return userService.getUsers();
    }
       
       
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user )
    {
            return userService.saveUser(user);
    }
    
    @PutMapping("/updateUsers/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user)
    {
        return userService.updateUser(id,user);
    }
    
    @DeleteMapping("/deleteUsers/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable Long id)
    {

        boolean deleted=false;
        deleted=userService.deleteUser(id);
        Map<String,Boolean> response =new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);

        // User user=userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not exist"));
        // userRepository.delete(user);
        // Map<String,Boolean> response=new HashMap<>();
        // response.put("deleted successfully",Boolean.TRUE);
        // return ResponseEntity.ok(response);
   }  
   @DeleteMapping("/deleteAllUsers")
    public String deletedUser()
   {
       userService.deletedUser();
       return "successfully deleted";
   }

}

  