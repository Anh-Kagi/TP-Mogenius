# Heart Live

A small web app that allows you to send hearts around the world.

## Deployment

```shell
docker compose up --build
```

And the web app is live at http://localhost:8080

And voila! You can send heart by clicking the "Send ❤️" button.

The demo server is live ~~[here](http://tcp-mo1.mogenius.io:62607/)~~ (the access point to the server has been reset without warning, the new address is here: [here](http://tcp-mo1.mogenius.io:51916)).

## How it works

The server exposes two entrypoints, one to get all the hearts in the database, and one to create them.

At the page loading, it fetches all the hearts in the database and display them.
When the button is pressed, it calls the creation entrypoint and reloads the page.