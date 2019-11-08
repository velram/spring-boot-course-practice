package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UdemyUserJPAController {

    @Autowired
    private UdemyUserJPADaoService udemyUserDaoService;

    @Autowired
    private UdemyUserJPARepository udemyUserRepository;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/jpa/users")
    public List<UdemyUser> retrieveAllUdemyUsers(){
        return udemyUserDaoService.findAllUdemyUsers();
    }

    @GetMapping("/jpa/users/{id}")
    public UdemyUser retrieveAllUdemyUsers(
            @PathVariable int id){

        Optional<UdemyUser> result = udemyUserDaoService.findUdemyUserById(id);
        if(!result.isPresent()){
            return null;
        }
        return result.get();
    }

    @DeleteMapping("/jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        udemyUserDaoService.deleteById(id);
    }

    @PostMapping("/jpa/users/create")
    public ResponseEntity<Object> createUser(@RequestBody UdemyUser pUdemyUser){

        UdemyUser createdUser = udemyUserRepository.save(pUdemyUser);
        URI createdUserURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdUser.getUdemyId()).toUri();
        return ResponseEntity.created(createdUserURI).build();
    }

    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable int id) throws UdemyUserNotFoundException {
         List<Post> userPosts = udemyUserDaoService.findPostsByUser(id);
        return userPosts;
    }


    @PostMapping("/jpa/users/{id}/posts")
    public ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody Post post) throws UdemyUserNotFoundException {
        Optional<UdemyUser> userOptional = udemyUserDaoService.findUdemyUserById(id);
        if(!userOptional.isPresent()){
            throw new UdemyUserNotFoundException("User is not found with id : "+id);
        }
        UdemyUser user = userOptional.get();
        post.setUser(user);
        postRepository.save(post);
        URI postUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
        return ResponseEntity.created(postUri).build();
    }

}
