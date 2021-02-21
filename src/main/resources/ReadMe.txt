#Command to run docker image
docker run --name saket-redis --hostname saket-redis-host -p 6379:6379 redis

#Command to login into docker container
docker exec -it saket-redis sh

#Redis cli command to execute redis specific commands
redis-cli

#if this returns PONG that means redis server is up and running
ping

#This will return the object associated with the key
get key



Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Try the new cross-platform PowerShell https://aka.ms/pscore6

PS C:\Users\saket.maheshwary> docker exec -it saket-redis sh
# redis-cli
127.0.0.1:6379> get 12345
(nil)
127.0.0.1:6379> get 12345
(nil)
127.0.0.1:6379> exit
# redis-cli get 12345
(nil)
#

