/**
 * Created by 张连芳 on 2016/11/4.
 */
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by 张连芳 on 2016/11/2.
 */
class Bag<T> implements Collection<T> {
    private ArrayList<T> holder = new ArrayList<T>();


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        holder.size();
        if (holder.size()==0){
            return  true;

        }

        else{return false;}
    }

    @Override
    public boolean contains(Object o) {
        holder.contains(o);
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        holder.add(t);
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return holder.remove(o);}

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
    @Override
    public String toString() {

        Collections.shuffle(holder);

        return holder.toString();
    }

}


