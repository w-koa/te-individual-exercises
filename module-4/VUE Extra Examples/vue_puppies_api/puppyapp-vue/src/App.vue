<template>
  <div id="app">
        <router-link :to="{ name: 'home' }" tag="a" exact>[   Home   ]</router-link>
        <router-link :to="{ name: 'display' }" tag="a">[   List All Puppies   ]</router-link>
        <router-link :to="{ name: 'add' }" tag="a">[   Add Puppies   ]</router-link>
        <router-view/>
  </div>
</template>

<script>

export default {
  name: 'App'
}
</script>

