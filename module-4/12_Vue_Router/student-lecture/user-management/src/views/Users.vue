<template>
  <div class="users">
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
        </tr>
      </thead>
      <tbody>
 
      </tbody>
    </table>
  </div>
</template>

<script>
import userService from '@/service/UserService';

export default {
  name: 'users',
  data() {
    return {
      users: []
    }
  },
  methods: {
    getUsers() {
      userService.list().then(users => this.users = users);
    }
  },
  created() {
    this.getUsers();
  }
}
</script>

<style>
td, th {
  padding:6px;
  margin:0;
}
tr:nth-child(even) {
  background-color: rgb(216, 216, 216);
}
a, a:hover, a:visited {
  color:blue;
  text-decoration:none;
  text-transform: uppercase;
}
</style>

