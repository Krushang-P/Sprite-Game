/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * Name of Student: Krushang Patel 041021848
 * Name of Student: Judi Swar 041023983
 * Class Name: AppuserFacade
 */

package cst8218.base0001.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Krushang Patel
 */
@Stateless
public class AppuserFacade extends AbstractFacade<Appuser> {

    @PersistenceContext(unitName = "SpriteBasePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppuserFacade() {
        super(Appuser.class);
    }
    
}
