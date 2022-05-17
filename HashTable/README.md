# Hashtables

![code32](./32.jpg)  



## Challenge
Implement a hash table with the following methods; set(put), get, contains, keys, and hash.

## Approach & Efficiency
The time complexity of set, get, contains, and keys are O(1).
The space complexity of hash map is O(n)
## API
- set
Arguments: key, value
Returns: nothing
This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
Should a given key already exist, replace its value from the value argument given to this method.

- get
Arguments: key
Returns: Value associated with that key in the table

- contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.

- keys
Returns: Collection of keys
 
- hash
Arguments: key
Returns: Index in the collection for that key