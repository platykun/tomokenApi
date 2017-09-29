package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 */
@RestController
@RequestMapping(value="api/users/")
public class UsersController {

    @Autowired
    UsersService usersService;

    /**
     * ユーザIDをもとにユーザを取得する。
     *
     * @param id ユーザID
     * @return ユーザ
     */
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public UserForm get(@PathVariable Integer id){

        // nullチェック
        if(id == null){
            return null;
        }

        User user = usersService.getUserById(id);
        UserForm userForm = UserHelper.toForm(user);

        return userForm;
    }

    /**
     * 全ユーザを取得する。
     *
     * @return ユーザ一覧
     */
    @RequestMapping(value="all", method = RequestMethod.GET)
    public List<UserForm> getAll(){
        List<User> users = usersService.getAllUsers();
        List<UserForm> userForms = UserHelper.toFormList(users);
        return userForms;
    }

    /**
     * ユーザを更新する。
     *
     * @param userForm ユーザ
     * @return 更新後ユーザ
     */
    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public UserForm updateUser(@PathVariable Integer id, @Validated UserForm userForm){
        User user = UserHelper.toEntity(userForm);
        User updatedUser = usersService.updateUser(user);
        UserForm updatedUserForm = UserHelper.toForm(updatedUser);
        return updatedUserForm;
    }

    /**
     * ユーザを削除する。
     *
     * @param id 削除ユーザID
     * @return 削除結果
     */
    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public int delete(@PathVariable Integer id){
        return 0;
    }
}
