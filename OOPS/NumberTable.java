class Table{
    int n,ta;
    Table(){
        n=2;
    }
    Table(int x){
        n=x;

    }
    Table(Table t){
        n=t.n;
    }
    void TableNum(){
        for(int i=1;i<=10;i++){
            ta=n*i;
            System.out.println(ta);
        }
    }
}
public class NumberTable {
    public static void main(String[] args) {
        Table s1=new Table();
        Table s2=new Table(3);
        Table s3=new Table(s2);
        s1.TableNum();
        s2.TableNum();
        s3.TableNum();
    }
    
}
