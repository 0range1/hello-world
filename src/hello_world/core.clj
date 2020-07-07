(ns hello-world.core
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [request]
      {:status 200
       :headers {"Content-Type" "text/html"}
       :body "Hello World! I am Lori."})

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
      (run-jetty handler {:port  3000
                          :join? false})
      (println "Start Http-Kit Server On Port 5000..."))