import axios from "axios";

export default axios.create({
    baseUrl: "https://9c96-103-106-239-104.ap.ngrok.io",
    headers: {"ngrok-skip-browser-warning": "true"}

    // baseUrl: "http://localhost:8080",
    // timeout: 20000,
    // headers: {"Content-type": "application/json"}
});