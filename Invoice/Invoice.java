import org.omg.DynamicAny._DynAnyFactoryStub;

public class Invoice {
    public String _description;
    public String _partNumber;
    public int _quantity;
    public double _pricePerItem;

    public Invoice(String description,String partNumber, int quantity, double pricePerItem) {
        _description = description;
        _partNumber = partNumber;
        _pricePerItem = pricePerItem;
        _quantity = quantity;
    }

    public void setDescription(String description){
        _description = description;
    }
    
    public String getDescription(){
        return _description;
    }

    public void setPartNumber(String partNumber){
        _partNumber = partNumber;
    }
    
    public String getPartNumber(){
        return _partNumber;
    }

    public void setQuantity(int quantity){
        _quantity = quantity;
    }
    
    public int getQuantity(){
        return _quantity;
    }

    public void setPricePerItem(int pricePerItem){
        _pricePerItem = pricePerItem;
    }
    
    public double getPricePerItem(){
        return _pricePerItem;
    }

    public double getInvoiceAmount(){
        if(_quantity <= 0 || _pricePerItem <= 0){
            return 0;
        }
        return _pricePerItem * _quantity;
    }
}
