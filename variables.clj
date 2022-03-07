; BASIC TYPES
(def randVar 10)
(println randVar)

(def randDouble 1.123)
(println randDouble)

(def randBool false)
(println randBool)

; TYPE CHECKING
(println (type randBool))
(println (type nil))

(println (nil? randDouble))
(println (pos? randVar))
(println (neg? randVar))
(println (even? randVar))
(println (odd? randVar))
(println (float? randVar))
(println (integer? randDouble))

(def randStr "abc'defg")
(println randStr)


; VECTORS AND LISTS
(vector 1 2 3 4 5)

(def tmp
  [1 2 "string" \c])
(println tmp)

'(1 2 3 4 5)
(list 1 2 3 4 5)

(def tmpVector
  (vector 1 2 3 4 5))

(def tmpList
  (list 1 2 3 4 5))

; 10 goes to the back
(println (conj tmpVector 10))
; 10 goes to the front
(println (conj tmpList 10))

; polymorphism
; lists and vectors and 2 different types
; but they are treated as the same for certain functions
; and the type is collection

; both vectors and lists are collections
(println (coll? tmpVector)) ; true
(println (coll? tmpList)) ; true

; but only a list is a seq
(println (seq? tmpVector)) ; false
(println (seq? tmpList)) ; true

(println (first '(a b c))) ; a
(println (rest '(a b c))) ; (b c)
(println (cons 'a '(b c))) ; (a b c)

(println (first tmpVector))
(println (first tmpList))

(println (last tmpVector))
(println (last tmpList))

; SETS
(set [1 2 3 3 3 3]) ; duplicates are removed

(def tmp-set
  #{1 2 3})

(coll? tmp-set)
(first tmp-set)
(second tmp-set)

; HASH MAPS (equal to JSON or dict)
(hash-map {"a" 1 "b" 2})

(def tmp-map
  {"b" 2 "a" 1 "rand" [1 2 { "a" "b" }] "another" { "b" 1 "a" 0 }})
(println tmp-map)

(println (get tmp-map "a")) ; 1
; get-in takes path to a key
(println (get-in tmp-map ["rand" 1])) ; 2

; add new value
(println (assoc tmp-map "c" 3))
; assoc-in takes path to a key
(println (assoc-in tmp-map ["another" "c"] 3))

; get rid of an entire slice at provided key
(println (dissoc tmp-map "b"))
