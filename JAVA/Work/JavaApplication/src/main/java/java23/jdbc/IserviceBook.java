package java23.jdbc;

import javax.management.modelmbean.ModelMBeanAttributeInfo;

public interface IserviceBook extends IBook {
    
    public int transComit(ModelBook b1, ModelBook b2);
    public int transRollback(ModelBook b1, ModelBook b2);
}
