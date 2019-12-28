# 二叉树的前中后(递归和非递归),层次遍历

### 先序遍历:

- ​

```java
 //递归: 这个都是非常简单的,打印时机不同,就是不同的遍历方式
public static void preOrderRecurs(Node head){
        if (head ==null ){
            return ;
        }
        System.out.println(head.val+"");
        preOrderRecurs(head.left);
        preOrderRecurs(head.right);
    }
```

- 非递归:

```java 
//树的遍历是调用系统栈进行的,所以非递归就是借助栈的思想来完成的
public static void preOrderTraverse(Node head){
        System.out.println("preOrder: ");
        if (head != null){							//根结点不为空,则进入
            Stack<Node> stack = new Stack<>();		//创建一个栈
            stack.push(head);
            while (!stack.isEmpty()){				
                head =stack.pop();
                System.out.println(head.val+"");
                //因为栈是一个东西的逆序,先要打印左就要后压入左
                if (head.right!=null){				//如果当前结点的右孩子不为空,先压入
                    stack.push(head.right);
                }else if (head.left!= null){		//当前结点的左孩子不空再压入
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }
```



### 中序遍历:

递归:

- ```java
  public static void inOrderRecurs(Node head){
          if (head ==null ){
              return ;
          }
          inOrderRecurs(head.left);
          System.out.println(head.val+"");
          inOrderRecurs(head.right);
      }
  ```

非递归:

- ```java
  //也是根据栈来完成的
  public  static void inOrderTraverse(Node head){
          System.out.println("inOrderT: ");
          Stack<Node> stack = new Stack<>();
  		
          while (!stack.isEmpty() || head!=null){
              if (head!= null){					//如果当前结点不空,一路压做孩子,直到空
                  stack.add(head);
                  head= head.left;
              }else{								//当当前结点为空,弹出并打印,进入右孩子
                  head =stack.pop();
                  System.out.println(head.val+" ");
                  head= head.right;
              }
          }
          System.out.println();
      }
  ```



### 后序遍历:

- ```java
  //递归
  public static void posOrderRecurs(Node head){
          if (head ==null ){
              return ;
          }
          posOrderRecurs(head.left);
          posOrderRecurs(head.right);
          System.out.println(head.val+"");
      }
  ```

非递归:

因为 ,先序遍历,中序遍历,后续遍历在递归中就是打印时机不同(递归过程一个结点可以回到自身3次),

在第一次的时候打印就是先序遍历

在第二次的时候打印就是中序遍历

在第三次的时候打印就是后序遍历



因为自己创建的栈没有那么强大,所以后续遍历 很复杂;**左右中,**

然而我们知道了先序遍历(**中左右**),我们可以相同方式实现**中右左**;

然后在创建一个栈把中右左的放进去,**栈是一个序列的逆序**

这样后续遍历就非常简单了.

- ```java
  public static void posOrderTraverse(Node head){
          if (head != null){
              Stack<Node> stack1 = new Stack<>();
              Stack<Node> stack2 = new Stack<>();
              stack1.push(head);
              while (!stack1.isEmpty()){
                  head =stack1.pop();
                  stack2.push(head);
                  if (head.left!=null){
                      stack1.push(head.left);
                  }else if (head.right!=null){
                      stack1.push(head.right);
                  }
              }
              while (stack2!= null){
                  Node cur =stack2.pop();
                  System.out.println(cur.val);
              }
              System.out.println();
          }
      }
  ```





### 层次遍历:

**层次遍历也是(宽度优先遍历),和之前的三种不同(深度优先遍历),这需要队列来实现**

按层打印出来,我们只需要用一个变量记录每层结点的数量即可;

```java
public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res =new ArrayList<>();
        if (root ==null){								//判断特殊情况
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int length =q.size();						//找一个变量记录有多少结点,何时换行
            ArrayList<Integer> tem = new ArrayList<>(); //记录那一层的结点值
            for (int i = 0; i < length; i++) {
                TreeNode cur = q.poll();
                tem.add(cur.val);
                if (cur.left!=null){
                    q.add(cur.left);
                }if (cur.right!=null){
                    q.add(cur.right);
                }
            }
            res.add(tem);
        }
        return res;
    }

```







