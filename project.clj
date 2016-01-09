(defproject phrame "0.1.0-SNAPSHOT"
  :description "Server to generate Google OAuth2 tokens"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [sudharsh/clj-oauth2 "0.5.3"]
                 [ring "1.4.0"]
                 [compojure "1.4.0"]
                 [org.apache.httpcomponents/httpclient "4.5.1"]
                 [clj-http "2.0.0"]]
  :main clj-oauth2-token-generator.core)
