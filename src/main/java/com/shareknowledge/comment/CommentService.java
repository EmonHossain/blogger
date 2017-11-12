package com.shareknowledge.comment;

import com.shareknowledge.base.BlogService;
import com.shareknowledge.util.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Emon Hossain on 10/21/2017.
 */
public class CommentService implements BlogService{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommentDao commentDao;

    @Override
    public <T> List<T> getAll() {
        return commentDao.findAll(CommentEntity.class);
    }

    @Override
    public <T> Object getUniqueResult(T id) {
        return commentDao.findById(CommentEntity.class,id);
    }

    @Override
    public <T> boolean save(T object) {
        try {
            commentDao.saveEntity(CommentEntity.class.getName(),object);
            logger.debug(CommentEntity.class.getName() +"is saved");
            return true;
        }catch (Exception ex){
            logger.debug(Message.DEBUG_CAUSE_DATA_INTEGRITY_VIOLATION_EXCEPTION);
            logger.debug(Message.DEBUG_CAUSE_GENERAL+ex.getCause());
        }
        return false;
    }

    @Override
    public <T> boolean update(T object) {
        try {
            commentDao.updateEntity(CommentEntity.class.getName(),object);
            logger.debug(CommentEntity.class.getName()+"update successful");
            return true;
        }catch (Exception ex){
            logger.debug(Message.DEBUG_CAUSE_DATA_INTEGRITY_VIOLATION_EXCEPTION);
            logger.debug(Message.DEBUG_CAUSE_GENERAL+ex.getCause());
        }
        return false;
    }

    @Override
    public <T> boolean delete(T id) {
        try {
            commentDao.deleteEntity(new CommentEntity((long) id));
            logger.debug(CommentEntity.class.getName()+"delete successful");
            return true;
        }catch (Exception ex){
            logger.debug(Message.DEBUG_CAUSE_DATA_INTEGRITY_VIOLATION_EXCEPTION);
            logger.debug(Message.DEBUG_CAUSE_GENERAL+ex.getCause());
        }
        return false;
    }
}
