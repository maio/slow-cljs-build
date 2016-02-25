(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'slow.core
   :output-to "out/slow.js"
   :output-dir "out"})
