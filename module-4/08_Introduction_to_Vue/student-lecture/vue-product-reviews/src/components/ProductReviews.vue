<template>
  <div id="main">
    <h2>Product Review for {{name}}</h2>

    <p>{{description}}</p>
  </div>
</template>

<script>
export default {
    name: 'ProductReview',
    data() {
        return {
            name: 'Squirrel Cigar Parties For Dummies',
            description: 'Banned in 69420 countries.'
        }
    }

}
</script>

<style scoped>

    div.main {
        margin: 1rem 0;
    }
</style>