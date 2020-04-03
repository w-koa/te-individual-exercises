<template>
<div id='main'>

    List teh doggos

</div>
  
</template>

<script>
export default {
    data() { 
        
        return { allTheDogs : []}
    },

  created() {
    fetch('http://localhost:8080/01-Puppies-API-Final/api/allPuppies')
    .then (
      
    )
  }
}

</script>

<style>

</style>`