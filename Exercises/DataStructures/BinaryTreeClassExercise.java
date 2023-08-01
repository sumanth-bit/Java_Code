package Exercises.DataStructures;

import java.util.*;

class Tnode{

    int data;
    Tnode right;
    Tnode left;

    Tnode(int ele){
        this.data = ele;
        this.right = null;
        this.left = null;
    }

}
class BinarySearchTree{

    Tnode root;

    BinarySearchTree(int ele){
        root = new Tnode(ele);
    }
    BinarySearchTree(){
        root = null;
    }

    public Tnode insert(Tnode root,int ele){
        if(root == null){
            root = new Tnode(ele);
        }
        else if(ele > root.data){
            //System.out.println("Going to right "+root.data);
            root.right = insert(root.right,ele);
        }
        else{
            //System.out.println("Going to left"+root.data);
            root.left = insert(root.left,ele);
        }
        //System.out.println("Root value is"+root.data);
        return root;
    }
    public void display(){

        Tnode temp = this.root;
        Queue<Tnode> q = new LinkedList<>();
        q.add(this.root);

        while(q.size() > 0){
            temp = q.remove();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        System.out.println();


    }

    public Tnode delete(Tnode root,int ele){
        if(root == null){
            return null;
        }
        else if(root.data < ele){
            root.right = delete(root.right,ele);
        }
        else if(root.data > ele){
            root.left = delete(root.left,ele);
        }
        else{
            if(root.right == null && root.left == null){
                return null;
            }
            else if(root.right != null && root.left != null){
                Tnode temp = root.right;
                Tnode prevNode = null;
                while(temp.left != null){
                    prevNode = temp;
                    temp = temp.left;
                }
                root.data = temp.data;

                if(temp.right != null) {
                    prevNode.left = delete(prevNode.left, temp.data);
                }

            }
            else{
                if(root.left != null){
                    Tnode temp = root.left;
                    root = null;
                    return temp;
                }
                else{
                    Tnode temp = root.right;
                    root = null;
                    return temp;

                }
            }
        }
        return root;
    }

    public Tnode changeNodeData(Tnode n){
        n.data  = 4;
        return n;
    }


}


public class BinaryTreeClassExercise{

    public static void main(String args[]){



        /*
        we can directly do this since root value is not changing
        BinarySearchTree bt = new BinaryTSearchTree();
        bt.root = bt.insert(bt.root,23);
        bt.insert(bt.root,67);
        etc...

        1.even if you assign it to bt.root = insert(bt.root,34) etc.. for all insert, root remains same, because
        2. After all the recursive process it comes back to root and returns the root address to the root
        3. Remember the recursive approach done using pen and paper.
        4. Genrally if any change done to the object or a copied object any where in the will reflected in original object
           "until unless original object is null & new object is not created in calling function" that is passed as parameter to a function.
          -> if we use new() key word in called method  then the calling method object data will not be changed until unless it is returned
          -> For otherwise objects data

        5. Since the they are all call by references so Changes are made at address level.
        6.clarity is important
        7. Paste the following code:
        Tnode ele1 = new Tnode(23);
        Tnode ele2 = null;
        ele2 = ele1;
        System.out.println(ele1.data); // 23
        System.out.println(ele2.data); //23
        ele2.data = 34;
        System.out.println(ele1.data); // 34
        System.out.println(ele2.data); //34
        bt.changeNodeData(ele2);
        System.out.println(ele1.data);
        System.out.println(ele2.data);

         */
        // it is always better to use root of the
        BinarySearchTree bt = new BinarySearchTree();

        bt.root = bt.insert(bt.root,45);
        //System.out.println(bt.root.data);
        bt.insert(bt.root,23);
        bt.insert(bt.root,34);
        bt.insert(bt.root,2);
        bt.insert(bt.root,98);
        bt.insert(bt.root,23);
        bt.insert(bt.root,24);
        bt.insert(bt.root,25);
        bt.insert(bt.root,38);
        bt.display();
        bt.delete(bt.root,23);
        bt.display();
        bt.delete(bt.root,23);
        bt.display();
        bt.delete(bt.root,23);
        bt.display();

        Tnode ele1 = new Tnode(0);
        bt.changeNodeData(ele1);
        System.out.println(ele1);
        Tnode ele2 = ele1;// Once you assign any null value to the object then you need to initialize it with new() key word and start using it
        ele2 = new Tnode(2);// this is compulsory for th object of any class
        System.out.println(ele2.data);
        System.out.println(ele1.data); // you will get null pointer exception cuz original one remains same.










    }

}