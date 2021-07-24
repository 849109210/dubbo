package service;

import model.Address;

/**
 * 张杰
 * 2021/7/24
 */
public interface UserService {
    Address checkAddressByUid(Integer uid);
}
