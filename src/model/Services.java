/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.norm.checker.norm.definition.Norm;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfo
 */
public class Services {
    private static List<ActionModel> actionModelList = null;
    private static List<ObjectModel> objectModelList = null;
    private static List<AttributeModel> attributeModelList = null;
    private static List<Norm> normModelList = null;
    
    
    private Services() {
        /*No use*/
    }
    public static List<ActionModel> getActionModelList() {
        if(actionModelList == null) {
            actionModelList = new ArrayList<ActionModel>();
        }
        return actionModelList;
    }
    
    public static List<ObjectModel> getObjectModelList() {
        if(objectModelList == null) {
            objectModelList = new ArrayList<ObjectModel>();
        }
        return objectModelList;
    }
    
    public static List<AttributeModel> getAttributeModelList() {
        if(attributeModelList == null) {
            attributeModelList = new ArrayList<AttributeModel>();
        }
        return attributeModelList;
    }
    public static List<Norm> getNormModelList() {
        if(normModelList == null) {
            normModelList = new ArrayList<Norm> ();
        }
        return normModelList;
    }
    
}
