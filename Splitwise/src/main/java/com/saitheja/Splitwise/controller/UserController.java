package com.saitheja.Splitwise.controller;

import com.saitheja.Splitwise.dto.UserLoginRequestDTO;
import com.saitheja.Splitwise.dto.UserRegistrationRequestDTO;
import com.saitheja.Splitwise.entity.User;
import com.saitheja.Splitwise.exception.UserRegistrationInvalidDataException;
import com.saitheja.Splitwise.mapper.EntityDTOMapper;
import com.saitheja.Splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody UserRegistrationRequestDTO userRegistrationRequestDTO) throws UserRegistrationInvalidDataException {
        validateUserRegistrationRequestDTO(userRegistrationRequestDTO);
        User savedUser = userService.signup(userRegistrationRequestDTO.getName(), userRegistrationRequestDTO.getEmail(), userRegistrationRequestDTO.getPassword());
        return ResponseEntity.ok(
                EntityDTOMapper.toDTO(savedUser)
        );
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserLoginRequestDTO userLoginRequestDTO){
        validateUserLoginRequestDTO(userLoginRequestDTO);
        User savedUser = userService.login(userLoginRequestDTO.getEmail(), userLoginRequestDTO.getPassword());
        return ResponseEntity.ok(EntityDTOMapper.toDTO(savedUser));
    }

    private void validateUserRegistrationRequestDTO(UserRegistrationRequestDTO requestDTO) throws UserRegistrationInvalidDataException {
        //TODO : validate if the email is proper
        //TODO : validate if password has atleast 8 characters including a small, capital, numeric and special character
        if(requestDTO.getEmail() == null ||
                requestDTO.getName() == null ||
                requestDTO.getPassword() == null){
            throw new UserRegistrationInvalidDataException("Invalid signup data");
        }
    }

    private void validateUserLoginRequestDTO(UserLoginRequestDTO userLoginRequestDTO){

    }
}
