package SpringApi.SpringApi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import SpringApi.SpringApi.api.model.User;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1, "John Bradford", 33, "johnbr@gmail.com" );
        User user2 = new User(2, "Stella Stimuli", 29, "stalse@gmail.com" );
        User user3 = new User(3, "Borrish Morley", 45, "moore@gmail.com" );
        User user4 = new User(4, "Jim Juan", 12, "jimj@gmail.com" );
        User user5 = new User(5, "Gills Pella", 18, "illspella@gmail.com" );

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    @SuppressWarnings("unchecked")
    public Optional<User> getUser(Integer id) {
        @SuppressWarnings("rawtypes")
        Optional optional = Optional.empty();

       for(User user: userList){
        if(id == user.getid()){
            optional= Optional.of(user);
            return optional;
        }
       } 
       return optional; 
    }

}
