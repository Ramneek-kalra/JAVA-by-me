package chapter.pkg24;

public abstract class MyAbstracList<E> implements MyList<E> {

    protected int size = 0;

    protected MyAbstracList() {

    }

    protected MyAbstracList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public  void add(E e){
    add(size, e);
}
 @Override
    public  boolean isEmpety(){
        return size==0;
    }
    
    @Override
    public  int size(){
         return size;
    }

    @Override
    public  boolean remove(E e){
        if(indexOf(e)>=0){
            remove(indexOf(e));
            return true;
        }else{
              return false;
        }
    }

   

}
