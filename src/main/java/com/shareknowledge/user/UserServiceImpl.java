package com.shareknowledge.user;

import com.shareknowledge.util.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public <T> List<T> getAll() {
        List<T> list = null;
        try {
            list = userDao.findAll(UserEntity.class);
            logger.debug("Result size " + list.size());
        } catch (Exception e) {
            logger.debug(Message.DEBUG_MESSAGE_GENERAL + e.getMessage());
            logger.debug(Message.DEBUG_CAUSE_GENERAL + e.getCause());
        }
        return list;
    }

    @Override
    public <T> Object getUniqueResult(T id) {
        UserEntity user = null;
        try {
            user = (UserEntity) userDao.findById(UserEntity.class, id);
            logger.debug("Single User is pulled");
        }catch (Exception e){
            logger.debug(Message.DEBUG_MESSAGE_GENERAL+e.getMessage());
            logger.debug(Message.DEBUG_CAUSE_GENERAL+e.getCause());
        }
        return user;
    }

    @Override
    public <T> boolean save(T object) {
        boolean saved = true;
        try {
            userDao.saveEntity(UserEntity.class.getName(), object);
            logger.debug("User is saved with information -> " + object.toString());
        } catch (DataIntegrityViolationException dive) {
            saved = false;
            logger.debug(Message.DEBUG_CAUSE_DATA_INTEGRITY_VIOLATION_EXCEPTION + dive.getCause());
        } catch (Exception e) {
            saved = false;
            logger.debug(Message.DEBUG_MESSAGE_GENERAL + e.getMessage());
            logger.debug(Message.DEBUG_CAUSE_GENERAL + e.getCause());
        }
        return saved;
    }

    @Override
    public <T> boolean update(T object) {
        boolean update = true;
        try {
            userDao.updateEntity(UserEntity.class.getName(), object);
            logger.debug("User is updated with information -> " + object.toString());
        } catch (DataIntegrityViolationException dive) {
            update = false;
            logger.debug(Message.DEBUG_CAUSE_DATA_INTEGRITY_VIOLATION_EXCEPTION + dive.getCause());
        } catch (Exception e) {
            update = false;
            logger.debug(Message.DEBUG_MESSAGE_GENERAL + e.getMessage());
            logger.debug(Message.DEBUG_CAUSE_GENERAL + e.getCause());
        }
        return update;
    }

    @Override
    public <T> boolean delete(T id) {
        boolean delete = true;
        try {
            userDao.deleteEntity(new UserEntity((int)id));
            logger.debug(Message.DEBUG_DELETE_ROW+id);
        } catch (Exception e) {
            delete = false;
            logger.debug(Message.DEBUG_MESSAGE_GENERAL + e.getMessage());
            logger.debug(Message.DEBUG_CAUSE_GENERAL + e.getCause());
        }
        return delete;
    }
}
