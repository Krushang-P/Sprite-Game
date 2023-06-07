/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 * Name of Student: Krushang Patel 041021848
 * Name of Student: Judi Swar 041023983
 * Class Name: SpriteSessionRemote
 */
package cst8218.base0001.game;
import cst8218.base0001.entity.Sprite;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author tgk
 */
@Remote
public interface SpriteSessionRemote {
    	List<Sprite> getSpriteList() throws RemoteException;
	void newSprite(MouseEvent e) throws RemoteException;
	int getHeight() throws RemoteException;
	int getWidth() throws RemoteException;
}
