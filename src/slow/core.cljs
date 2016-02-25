(ns slow.core)

(enable-console-print!)

(defmulti my-multimethod (fn [x] :whatever))

;; (defn my-fn [x] x)

(defn this-is-sloow-to-compile []
  (my-multimethod
   (my-multimethod
    (my-multimethod
     (my-multimethod
      (my-multimethod
       (my-multimethod
        (my-multimethod
         (my-multimethod
          (my-multimethod
           (my-multimethod
            (my-multimethod
             (my-multimethod
              (my-multimethod
               (my-multimethod
                (my-multimethod
                 (my-multimethod
                  (my-multimethod
                   (my-multimethod
                    (my-multimethod
                     (my-multimethod {})))))))))))))))))))))
