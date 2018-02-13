(ns web.core
  (:require [org.httpkit.server :as s]
    [compojure.core :refer [routes POST GET ANY]]))

(defn app []
  (routes
    (GET "/" [:as req]
      {:status 200
      :headers{"Content-type" "text/html"}
      :body "<h1> Surprise motherfucker </h1>" })))

      
  (defn create-server [] 
    (s/run-server (app) {:port 8080}))

  (defn stop-server [server]  
   (server :timeout 200))
    

