; HIGH ORDER FUNCTIONS

(map inc [1 2 3 4 5])
(map
 (fn [n]
   (* 3 n))
 [1 2 3 4 5])

; shorthand
; % is a passed argument
(map
  #(* 3 %)
  [1 2 3 4 5])

(filter
  even?
  [1 2 3 4 5])

(filter
  #(= 3 %)
  [1 2 3 4 5])

; calc sum
(reduce
  (fn [acc, curr]
    (+ acc curr))
  0
  [1 2 3 4 5])

(reduce
  (fn [acc, curr]
    (assoc acc curr curr))
  {}
  [1 2 3 4 5])

(some #{1} [4 5 0 2 1 2 3])
