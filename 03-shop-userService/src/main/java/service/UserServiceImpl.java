package service;

import model.Address;

/**
 * 张杰
 * 2021/7/24
 */
public class UserServiceImpl implements UserService{

    public Address checkAddressByUid(Integer uid) {
        Address address = new Address();
        System.out.println("==启动userService服务==");
        if (uid == 1){
            address.setPhone("13972000000");
            address.setName("李静");
            address.setCity("杭州");
        }else if (uid == 2){
            address.setPhone("18975240000");
            address.setName("陈琪");
            address.setCity("北京");
        }
        return address;
    }
}
