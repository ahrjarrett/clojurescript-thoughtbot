(ns cljs-thoughtbot
  (:require [clojure.string :as string]))

(clojure.string/blank? "Sean Brage") ;; => false

(string/blank? "") ;; => true

(def x 1)

x ;; => 1

;; We can also refer to top-level defs by fully qualifying them.

cljs-thoughtbot/x ;; => also 1

;; From within LET declarations, we can get access to the variables
;; we are defining by fully qualifying the variable within the
;; binding. For example, this form returns 1, instead of the two
;; we would expect:

(let [x 2]
  cljs-thoughtbot/x) ;; => 1

;; DEF vs. DEFN:
;; One way to define a function is like this:

(def y (fn [] 4))

(y) ;; => 4

;; This is longhand for the more idiomatic DEFN:

(defn z [] 5)

(z) ;; => 5

;; Map stuff (the data structure):

(def some-map {:first-key "first value" :first-number 12})

some-map ;; {:first-key "first value", :first-number 12}

;; Functions that work on maps...

;; COUNT returns the number of keys:

(count some-map) ;; 2




