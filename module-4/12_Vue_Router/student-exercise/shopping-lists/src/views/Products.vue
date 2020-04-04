<template>
  <div class="products">
    <h1>Shop By Department</h1>
    <p>Below is a list of our departments. Please click on a department to view available products by department.</p>
    <div class="departments">
      <div v-for="department in departments" :key="department" v-bind:class="department.class">
        <router-link :to="{name: 'products-list', params: {department: department.name}}">
          <img v-bind:src="require('../assets/images/' + department.banner)" />
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "products",
  data() {
    return {
      departments: [
        {
          name: "produce",
          path: "/produce",
          banner: "produce_banner.png",
          class: "department produce"
        },
        {
          name: "dairy",
          path: "/dairy",
          banner: "dairy_banner.png",
          class: "department dairy"
        },
        {
          name:"meat",
          path: "/meat", 
          banner: "meat_banner.png", 
          class: "department meat" },
        {
          name: "bakery",
          path: "/bakery",
          banner: "bakery_banner.png",
          class: "department bakery"
        }
      ]
    };
  }
};
</script>

<style>
.departments {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}
</style>
