#!/usr/bin/env bash

network=redis_cluster

for ind in `seq 1 6`; do \
 docker run -d \
 -p "$((6378+$ind)):6379" \
 -v D:\\Programming\\Java\\redis-demo\\cluster-config.conf://usr//local//etc//redis//redis.conf \
 --name "redis-$ind" \
 --net ${network} \
 redis redis-server //usr//local//etc//redis//redis.conf; \
done

echo 'yes' | docker run -i --rm --net ${network} ruby sh -c "\
 gem install redis --version 4.0.1 \
 && wget http://download.redis.io/redis-stable/src/redis-trib.rb \
 && ruby redis-trib.rb create --replicas 1 $(docker inspect --format='{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}:6379' redis-{1..6} | xargs)"
