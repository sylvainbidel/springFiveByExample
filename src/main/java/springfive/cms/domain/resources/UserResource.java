package springfive.cms.domain.resources;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import springfive.cms.domain.models.User;
import springfive.cms.domain.vo.NewsRequest;
import springfive.cms.domain.vo.UserRequest;

/**
 * @author claudioed on 29/10/17. Project cms
 */


public class UserResource {


  public ResponseEntity<User> findOne( String id){
    return ResponseEntity.ok(new User());
  }


  public ResponseEntity<List<User>> findAll(){
    return ResponseEntity.ok(Arrays.asList(new User(),new User()));
  }


  public ResponseEntity<User> newUser(UserRequest userRequest){
    return new ResponseEntity<>(new User(), HttpStatus.CREATED);
  }


  public void removeUser( String id){
  }


  public ResponseEntity<User> updateUser( String id,User userRequest){
    return new ResponseEntity<>(new User(), HttpStatus.OK);
  }

}
