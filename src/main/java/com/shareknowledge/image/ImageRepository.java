package com.shareknowledge.image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Emon Hossain on 8/23/2017.
 */
@Repository
public interface ImageRepository extends JpaRepository<ImageEntity,Long>{
}
