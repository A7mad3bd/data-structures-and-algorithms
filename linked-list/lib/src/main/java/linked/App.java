package linked;

public class App {

    public static void main(String[] args) {
        linked<String> list = new linked();
        list.inseert("1");
        list.inseert("2");
        list.inseert("3");
        list.inseert("4");
        list.inseert("5");

        System.out.println(list.includes("5"));
        System.out.println(list.includes("6"));

        System.out.println(list);



/*


insert
Arguments: value
Returns: nothing
Adds a new node with that value to the head of the list with an O(1) Time performance.

includes
Arguments: value
Returns: Boolean
Indicates whether that value exists as a Node’s value somewhere within the list.


to string
Arguments: none
Returns: a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

Any exceptions or errors that come from your code should be semantic, capture-able errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).
* */

    }
}