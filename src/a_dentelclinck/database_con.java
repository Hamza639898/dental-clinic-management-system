package a_dentelclinck;
import RSMaterialComponent.RSComboBox;
import RSMaterialComponent.RSTextFieldMaterial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class database_con{

    Statement std;
    Connection con;
    ResultSet rs;
    public JTable t=null;
    
     public void report(String path,String sql){
         try{
             this.setConnection();
             JasperDesign design=JRXmlLoader.load(path);
             JRDesignQuery query=new JRDesignQuery();
             design.setQuery(query);
             query.setText(sql);             
             JasperReport  rep=JasperCompileManager.compileReport(design);
             JasperPrint pr=JasperFillManager.fillReport(rep,null,con);
             JasperViewer.viewReport(pr,false);
       }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
  }
      public void setConnection(){
        try{
             java.lang.Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/dental_clinic","root","");
            std=con.createStatement();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No Connection!");
        }
        }
       public void setTable(JTable ta){
       t=ta;
    }
    public JTable getTable(){
        return t;
    }  
    public void setSql(String sql){
    try{
            setConnection();
            rs=std.executeQuery(sql);
            if(rs.next())
                JOptionPane.showMessageDialog(null, rs.getString("Message"));
             else
                JOptionPane.showMessageDialog(null, "failed");
                
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
}
    
    public void viewTable(String sql,JTable table){
         try{
            setConnection();
           rs=std.executeQuery(sql);
           table.setModel(DbUtils.resultSetToTableModel(rs));
           con.close();
          
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
     public ResultSet search(String sql){
         try{
            setConnection();
            rs=std.executeQuery(sql);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
     public void fillComboBox(JComboBox box, String sql, String field){
          try{
            setConnection();
            rs=std.executeQuery(sql);
            while(rs.next()){
                box.addItem(rs.getString(field));
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
     }
         
    public void ComboBox(String sql,JComboBox box,String field){
         setConnection();
        try{
            rs=std.executeQuery(sql);
            while(rs.next()){
                box.addItem(rs.getString(field));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public String getid(String sql,String col)
    {
        String id="";
       setConnection();
        try{
            rs=std.executeQuery(sql);
            if(rs.next()){
               id=rs.getString(col);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return id;
    }
    public void getValue(String sql,String field,JLabel lb){
        this.search(sql);
        try
        {
           if(rs.next())
           {
               lb.setText(rs.getString(field));
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    void setsql(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fillComboBox(RSTextFieldMaterial txtromno, String select_concatrom_norom_nameroom_from_room, String room) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fillComboBox(String select_concatcus_nocus_nametellcustomer_f, RSComboBox txtcus, String customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSql(String query, String deleted_successfully) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

