public class main {

    public static void main(String[] args){

        Queue q=new Queue();


        q.add("X");
        q.add("Y");
        q.add("Z");

        System.out.println(q.remove()); // Returns X
        System.out.println(q.remove()); // Returns Y
        System.out.println(q.remove()); // Returns Z
        System.out.println(q.remove()); // Returns null

    }

}


class Queue<T> {
    private java.util.ArrayList<T> list = new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public void add(T o) {
        list.add(o);
    }

        public T remove(){
            if(isEmpty()){return null;
            }else return list.remove(0);
        }

    public boolean isEmpty() {
        return list.isEmpty();
        }


}


