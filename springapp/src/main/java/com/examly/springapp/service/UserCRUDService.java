package com.examly.springapp.service;
import com.examly.springapp.model.User;
import com.examly.springapp.model.Dto;
import java.util.List;
import com.examly.springapp.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
//import org.modelmapper.ModelMapper;
//import org.springframework.context.annotation.Bean;
@Service
public class UserCRUDService {
    
 @Autowired
 private UserRepository userRepository;
//  @Autowired
//     private ModelMapper modelMapper;
    // private UserRepository userRepository;
    // public UserServiceImp(UserRepository userRepository) {
    //     this.userRepository = userRepository;
    // }

    public List<Dto> getUsers(){
        return userRepository.findAll()
        .stream()
        .map(this::convert)
        .collect(Collectors.toList());

    }
    private Dto convert(User user){
      Dto ud=new Dto();
      ud.setId(user.getId());
      ud.setUsername(user.getUsername());
      ud.setEmail(user.getEmail());
      ud.setMobileNumber(user.getMobileNumber());

      //additional
      ud.setActive(user.getActive());
      return ud;
  }
  //   private Ud convert(User user){
  //     Ud ud=new Ud();
  //     ud=modelMapper.map(user,Ud.class);
  //     return ud;
  // }
  
  
  public boolean deleteUser(Long id){
      User user=userRepository.findById(id).get();
      userRepository.delete(user);
      return true;
  }
 
  public void deletedUser(){
    
    userRepository.deleteAll();
   
}

  public User updateUser(Long id ,User user)
    {
        User prevUser=userRepository.findById(id).get();
        prevUser.setUsername(user.getUsername());
        prevUser.setEmail(user.getEmail());
        prevUser.setMobileNumber(user.getMobileNumber());
        prevUser.setPassword(user.getPassword());
        prevUser.setRole(user.getRole());
        prevUser.setActive(user.getActive());
        return userRepository.save(prevUser);
    }
    public User saveUser(User user)
    {
      return userRepository.save(user);
    }
}