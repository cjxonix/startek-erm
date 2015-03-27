/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import startek.erm.entity.Image;

/**
 *
 * @author Niwoogaba_Joel
 */
public interface ImageRepository extends JpaRepository<Image, Long>{
    
}
