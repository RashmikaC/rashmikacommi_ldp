import React, { useState } from "react";
import TextField from "../../atoms/TextField";
import ageLessThan20 from "../../../assets/age<20.png";
import ageLessThan40 from "../../../assets/age21-40.png";
import agegreaterThan40 from "../../../assets/age41+.png";
import { Box, MenuItem } from "@mui/material";
import ManIcon from "@mui/icons-material/Man";
import WomanIcon from "@mui/icons-material/Woman";

const UserDetails = () => {
  const [name, setName] = useState("");
  const [age, setAge] = useState("");
  const [error, setError] = useState("");
  const [img, setImg] = useState("");
  const [gender, setGender] = useState("");

  const handleNameChange = (event: {
    target: { value: React.SetStateAction<string> };
  }) => {
    setName(event.target.value);
  };

  const handleAgeChange = (event: { target: { value: any } }) => {
    const enteredAge = event.target.value;
    setAge(enteredAge);
    if (enteredAge < 1) setError("Age cannot be less than 1");
    else setError("");
    if (enteredAge > 0 && enteredAge <= 20) setImg(ageLessThan20);
    else if (enteredAge > 20 && enteredAge <= 40) setImg(ageLessThan40);
    else if (enteredAge > 40) setImg(agegreaterThan40);
    else setImg("");
  };

  const handleGenderChange = (event: {
    target: { value: React.SetStateAction<string> };
  }) => {
    setGender(event.target.value);
  };
  return (
    <Box
      width={"250px"}
      display={"flex"}
      flexDirection={"column"}
      padding={"50px"}
      gap={3}
    >
      <TextField
        label="Name"
        type="text"
        value={name}
        onChange={handleNameChange}
      />
      {name !== "" ? (
        <>
          <TextField
            label="Age"
            type="number"
            value={age}
            onChange={handleAgeChange}
            error={error !== ""}
            helperText={error}
          />
          {Number(age) > 0 ? <img src={img} alt="wrong age" /> : null}
          <TextField
            label="Select Gender"
            select
            fullWidth
            value={gender}
            onChange={handleGenderChange}
          >
            <MenuItem value="M">Male</MenuItem>
            <MenuItem value="F">Female</MenuItem>
          </TextField>
          {gender === "M" && <ManIcon color="primary" fontSize="large" />}
          {gender === "F" && <WomanIcon color="primary" fontSize="large" />}
        </>
      ) : (
        <></>
      )}
    </Box>
  );
};

export default UserDetails;
