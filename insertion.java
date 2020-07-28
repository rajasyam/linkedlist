public class insertion {
    public insertion head = null;
    public insertion tail = null;

    public int data;
    public insertion next;

    public insertion (int d){
        this.data = d;
        this.next = null;
    }

    public void tambah (int markocop){
        insertion node = new insertion(markocop);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            insertion i = head;
            head = node;
            head.next=i;
        }
    }
    public void addlast(int surotong){
        insertion newnode = new insertion(surotong);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void delete(int pos){
        if (pos == 0) {
            head = head.getnext();
            return;
        }
        insertion current = head;
        int count = 0;
        while (count < pos-1) {
            current = current.getnext();
            if (current == null) {
                throw new IndexOutOfBoundsException("Nggak ada");
            }
            count++;
        }
        if (current.getnext()==null){
            throw new IndexOutOfBoundsException("Nggak ada");
        }
        current.setNext(current.getnext().getnext());
    }

    public insertion(){
        this.getClass();
    }

    public String otong(){
        String output ="";
        insertion current = head;
        while (current != null) {
            output += current.getData()+"/";
            current = current.getnext();
        }
        return output;
    }

    public int getData(){return data;}
    public insertion getnext(){return next;}
    public void setData(int d) {
        data = d;
    }

    public void setNext(insertion tes){
        next = tes;
    }

    public static void main(String[] args) {
        insertion tes = new insertion();
        System.out.println("Qabla di delete :");
        tes.tambah(5);
        tes.tambah(7);
        tes.tambah(9);
        tes.tambah(0);
        tes.addlast(1);
        tes.addlast(3);

        System.out.println(tes.otong());

        System.out.println("Ba'da di delete :");
        tes.delete(3);
        System.out.println(tes.otong());
    }
}